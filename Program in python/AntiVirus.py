effected_virus = "virus.exe", "exploit.application", "internet_explorer.exe" 
def should_allow_program(filename): 
    if filename in effected_virus: 
        return False
    else:
        return True     
	
 

print(should_allow_program("virus.exe"))