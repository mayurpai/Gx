import random

class Hat:
    
    houses = ["A", "B", "C", "D", "E", "F"]
    # def __init__(self):
    #     self.houses = ["A", "B", "C", "D", "E", "F"]
    
    # def sort(self, name):
    #     print(f"{name} Is In {random.choice(self.houses)}")
    
    @classmethod    
    def sort(cls, name):
        print(f"{name} Is In {random.choice(cls.houses)}")
    
    
hat = Hat()
# hat.sort("Mayur")
Hat.sort("Mayur")