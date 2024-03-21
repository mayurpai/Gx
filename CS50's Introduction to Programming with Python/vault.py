class Vault:
    def __init__(self, galleons=0, sickles=0, knuts=0):
        self.galleons = galleons
        self. sickles = sickles
        self. knuts = knuts

    def __str__(self):
        return f"Galleons: {self.galleons}, Sickles: {self.sickles}, Knuts: {self.knuts}"
    
    def __add__(self, other):
        galleons = self.galleons + other.galleons
        sickles = self.sickles + other.sickles
        knuts = self.knuts + other.knuts
        return Vault(galleons, sickles, knuts)


potter = Vault(12, 323, 43)
print(potter)

weasly = Vault(1, 23, 45)
print(weasly)

galleons = potter.galleons + weasly.galleons

sickles = potter.sickles + weasly.sickles

knuts = potter.knuts + weasly.knuts

total = Vault(galleons, sickles, knuts)
print(total)

grand_total = potter + weasly

print(grand_total)


