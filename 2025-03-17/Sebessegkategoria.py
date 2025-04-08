class Sebessegkategoria:
    def __init__(self, utazosebesseg: int):
        self.utazosebesseg=utazosebesseg
    
    def getKategoriaNev(self):
        if self.utazosebesseg<500:
            return "Alacsony sebességű"
        elif self.utazosebesseg<1000:
            return "Szubszonikus"
        elif self.utazosebesseg<1200:
            return "Transzszonikus"
        else:
            return "Szuperszonikus"