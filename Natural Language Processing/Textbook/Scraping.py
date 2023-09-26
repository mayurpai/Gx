from bs4 import BeautifulSoup
from urllib.request import urlopen

my_url = "https://stackoverflow.com/questions/415511/how-to-get-the-current-time-in-python"

html = urlopen(my_url).read()

soupified = BeautifulSoup(html, "html.parser")

question = soupified.find("div", {"class": "question"})
question_text = question.find("div", {"class": "post-text"})
print("Best Question: ", question_text)

answer = soupified.find("div", {"class": "answer"})
answer_text = answer.find("div", {"class": "post-text"})
print("Best Answer: ", answer_text)

