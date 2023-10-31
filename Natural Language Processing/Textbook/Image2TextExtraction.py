from PIL import Image
from pytesseract import image_to_string

filename = "./Image-Text.png"
text = image_to_string(Image.open(filename))
print(text)