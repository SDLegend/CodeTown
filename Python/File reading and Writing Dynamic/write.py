import time
file=open("test.txt","w+")

for i in range(100):
	file.write("Line {}\n".format(i))
	time.sleep(0.1)
file.close()
print("Done")
