package assignment

def string= """Hello everyone, 
			this is a Multi-line string,
			example for assignment """
count=0
def vowels=["a","e","i","o","u"]
for (def i in string) {
	for (def j in vowels) {
		if (i==j) {
			count+=1
		
		}
	}
}
println "The number of vowels in the given string is :"+count