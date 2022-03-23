import argparse
import subprocess
from numpy import mean
from numpy import median

parser = argparse.ArgumentParser(prog='benchmark.py', description='Run benchmarks.')
parser.add_argument('rounds', type=int, help='how many interration should be made')
parser.add_argument('-t', '--target', type=str, nargs='?', default="ioX64",
                    help='which target (jvm, iosX64, etc) you want to run on')
parser.add_argument('-k', '--kmock', action='store_true')
parser.add_argument('-m', '--mockmp', action='store_true')
parser.add_argument('-a', '--mockative', action='store_true')

args = parser.parse_args()

target = args.target + "Test"
use = ":benchmark-kmock"
rounds = args.rounds

if args.mockmp:
    use=":benchmark-mockmp"

if args.mockative:
    use=":benchmark-mockative"

print("initial cleanup")
process = subprocess.Popen(['./gradlew', 'clean'],
                           stdout = subprocess.PIPE,
                           universal_newlines = True)

while True:
    return_code = process.poll()

    if return_code is not None:
        break

print("cleanup done")

gradleTask = use  + ":" + target

cmd = ['./gradlew', use +  ":" + "clean", gradleTask]

results = { "total": [], "ksp": [], "compile": [] }

for idx in range(0, rounds):
    useStart = True
    kspStart = 0
    kspEnd = 0

    process = subprocess.Popen(cmd, stderr = subprocess.PIPE,
                               stdout = subprocess.PIPE,
                               universal_newlines = True)
    print("Round " + str(idx))
    while True:
        output = process.stdout.readline()

        if output and output.startswith("KMOCK"):
            mark = output.split(":")[1].strip()

            if output.startswith("KMOCK_BENCHMARK_KSPTEST"):
                kspStart = int(mark)

            if output.startswith("KMOCK_BENCHMARK_KSP_END"):
                kspEnd = int(mark)
                results["ksp"].append(kspEnd-kspStart)

            if output.startswith("KMOCK_BENCHMARK_TEST_START") and useStart:
                useStart = False
                testStart = int(mark)
                results["compile"].append(testStart-kspEnd)

        if output and output.startswith("BUILD"):
            mark = output.split("in")[1].strip().strip('s')
            results["total"].append(int(mark))

        return_code = process.poll()
        if return_code is not None:
            print("Execution done")
            break


print("All:")
print(results)
print("\n\n")

print("Total")
print("AV: {}".format(mean(results["total"])))
print("Med: {}".format(median(results["total"])))
print("Lo: {}".format(min(results["total"])))
print("Hi: {}".format(max(results["total"])))
print("\n\n")

print("ksp")
print("AV: {}".format(mean(results["ksp"])))
print("Med: {}".format(median(results["ksp"])))
print("Lo: {}".format(min(results["ksp"])))
print("Hi: {}".format(max(results["ksp"])))
print("\n\n")

print("Compile")
print("AV: {}".format(mean(results["compile"])/1000))
print("Med: {}".format(median(results["compile"])/1000))
print("Lo: {}".format(min(results["compile"])/1000))
print("Hi: {}".format(max(results["compile"])/1000))
