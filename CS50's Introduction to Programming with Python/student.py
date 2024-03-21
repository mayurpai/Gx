class Student:
    def __init__(self, name, company = None):
        self.name = name
        self.company = company

    def __str__(self):
        return f"{self.name} Works For {self.company}"
    
    @classmethod
    def get(cls):
        name = get_name()
        company = get_company()
        return cls(name, company)

    def charm(self):
        match self.name:
            case "Mayur":
                self.company = "Gx"
            case _:
                self.company = "/"
        return self.company
    
    # Getter
    @property
    def company(self):
        return self._company
    
    # Setter
    @company.setter
    def company(self, company):
        if company not in ["Gx", "GalaxE"]:
            raise ValueError("Please provide a company")
        self._company = company
        
    @property
    def name(self):
        return self._name
    
    @name.setter
    def name(self, name):
        if not name:
            raise ValueError("Please provide a name")
        self._name = name

def main():
    student = get_student()
    student_dict = get_student_dict()
    print(student_dict)
    print(student)
    print(student_dict['name'] + student_dict['company'])
    if student['name'] == "Mayur":
        student['company'] = "Gx"
    print(f"{student['name']}, {student['company']}")
    
def main_class():
    # s = get_student_class()
    # if s:
    #     s.company = "ABCD"
    #     print(s)
    # else:
    #     print("Student object creation failed.")
    # print(s.charm())
    # print(f"{s.name} Works For {s.company}")
    s = Student.get()
    print("Student object", s.name, s.company)
    
def get_name():
    name = input("Enter your name: ")
    return name

def get_company():
    company = input("Enter your company: ")
    return company

def get_student():
    name = get_name()
    company = get_company()
    # return [name, company] # Mutable
    # return (name, company) # Immutable
    return {"name": name, "company": company} # Mutable
    

def get_student_dict():
    student = {}
    student["name"] = get_name()
    student["company"] = get_company()
    return student

def get_student_class():
    name = get_name()
    company = get_company()
    try:
        return Student(name, company)
    except ValueError as e: 
        print(e)

if __name__ == "__main__":
    # main()
    main_class()
