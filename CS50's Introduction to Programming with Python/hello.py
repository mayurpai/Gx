# Print Hello World
print("Hello World")

""" Take Name As A Input And Strip White Spaces"""
input = input("What's Your Name? ").strip().title()

# Print Hi And Name Here
print("Hi, " + input + "!", end="\n")
print("Hi,", input, "!", sep="##")
print(f"Hi, {input}!")

print(input.split(" "))