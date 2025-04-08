from Repulo import Repulo
from Sebessegkategoria import Sebessegkategoria

with open("utasszallitok.txt", "r", encoding="utf-8") as usz:
    usz.readline()
    repulok=[Repulo(sor) for sor in usz]
    
print("4. feladat: Adatsorok száma: ", len(repulok))

boeingRepulok=0
i=0


while(i<len(repulok)):
    if("Boeing" in repulok[i].tipus):
        boeingRepulok+=1
    i+=1

print("5. feladat: Boeing típusok száma: ", boeingRepulok)


maxUtas=0

maxUtasRepulo=repulok[0]

for repulo in repulok:
    if "-" in repulo.utas:
        jelenlegiUtas=int(repulo.utas.split("-")[1])
    else:
        jelenlegiUtas=int(repulo.utas)
        
    if jelenlegiUtas>maxUtas:
        maxUtas=jelenlegiUtas
        maxUtasRepulo=repulo
        
talaltKategoriak=set()
osszesKategoria={"Alacsony sebességű", "Szubszonikus", "Transzszonikus", "Szuperszonikus"}

for repulo in repulok:
    kategoria=Sebessegkategoria(repulo.utazoSebesseg).getKategoriaNev()
    talaltKategoriak.add(kategoria)
    
hianyzo=osszesKategoria-talaltKategoriak
        
        
#melyik sebessegkategoriabol nincs repulogep a fajlban
        
print("6. feladat: A legtöbb utast szállító repülőgéptípus")
print("\t Típus: ", maxUtasRepulo.tipus)
print("\t Első felszállás: ", maxUtasRepulo.ev)
print("\t Utasok száma: ", maxUtasRepulo.utas)
print("\t Személyzet: ", maxUtasRepulo.szemelyzet)
print("\t Utazósebesség: ", maxUtasRepulo.utazoSebesseg)

print("7. feladat: Olyan sebességkategória, amiben nincs repülő: ", hianyzo)