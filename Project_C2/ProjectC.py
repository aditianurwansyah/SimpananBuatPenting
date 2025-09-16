print("=======================================") 
name = input("Siapa nama mu : ")
print("=======================================") 
print(f"hello {name}")        
print("=======================================")
m = input(f"apa makanan kesukaan {name}? ") 
print("=======================================") 
u = input(f"apa minuman kesukaan mu {name}? ")
print("=======================================")
print("berharap saya ingin mengetahui kesukaan mu") 
print("=======================================") 
J1= input("hari ini kamu kayak nya lagi kesel kenapa emang? ") 
print("=======================================")
print((J1), f"(kata {name})")       
print("=======================================")
if(J1 == "berantem sama kakak"):    
     print("oh hahahaha kalo seorang kaka kesal teh da gitu emang, tapi itu bisa dijadikan sebagai keberanian biar tidak gugup")
else: 
    print("hmmm")         
print("=======================================")

print("=======================================")
J= input(f"sekarang gimana keadaan {name}")
print("=======================================") 
print(f"{J}") 
print("=======================================")
angka = int (input("Masukan angka yang kamu mau ? : "))
print("=======================================")  
print(f"angka yang kamu input : ",angka)  
if (angka < "2") :  
    
    print("Open") 
    print("=======================")
    print("Mooy itu apaan sih ?")
    print("=======================") 
    jawaban=input("Jawaban : ")  
    print("=======================")
    print(jawaban)  
    print("=======================") 
    
elif(angka < "3"): 
    print("bleee")
elif(angka < "4"):
    print("hoammmm")
else : 
    print("wheyyy")      

A = int (input("masukan angka : ")) 
print("Angka kamu adalah : ",A) 

print("=============================")
B = float(input("masukan angka : "))
print("Angka kamu adalah : ",B) 

print("hasil nya :",A+B)  


for i in range(5):
    print(i) 
print("============================")    
 
on = True 
i = 0 
while on:   
    var= input("apakah kamu ingin melanjutkan ketik y/n : ")
    i += 1 
    print(i)
    if var == "n": 
        on = False  
print("======================================") 
         
def my_function(i): 
 var = int(i) + 3   
 print(var) 
my_function(input("masukan penambahan angka : "))   
print("======================================") 
mulai = "hello" + " Guyss" 

print(mulai) 

