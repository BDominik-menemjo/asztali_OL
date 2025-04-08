class Repulo:
    def __init__(self, sor):
        sor = sor.strip().split(';')
        self.tipus = sor[0]
        self.ev = int(sor[1])
        self.utas = sor[2]
        self.szemelyzet = sor[3]
        self.utazoSebesseg = int(sor[4])
        self.felszalloTomeg = int(sor[5])
        self.fesztav = float(sor[6].replace(",","."))
