class Wizard:
    def __init__(self, name):
        if not name:
            raise ValueError("Please provide a name")
        self.name = name
        
    def __str__(self):
        return f"{self.name}"

class Student(Wizard):
    def __init__(self, name, house):
        super().__init__(name)
        self.house = house
        
    def __str__(self):
        return f"{self.name} works at {self.house}"

class Professor(Wizard):
    def __init__(self, name, subject):
        super().__init__(name)
        self.subject = subject
        
    def __str__(self):
        return f"{self.name} teaches {self.subject}"

wiz = Wizard("Mayur")
student = Student("S1", "H2")
professor = Professor("P1", "H1")

print(wiz)
print(student)
print(professor)