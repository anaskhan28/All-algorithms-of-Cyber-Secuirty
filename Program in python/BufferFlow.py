temps = [None]*10
numTemps = 0
infile = open("temps.txt","r")           # open temps.txt file in read mode
for line in infile.readlines():          # Read each line from a file
     for i in line.split():              # Split each temperature from the line
         temps[numTemps] = float(i)     
         numTemps += 1
print(str(numTemps) + ' temperatures were read.')

