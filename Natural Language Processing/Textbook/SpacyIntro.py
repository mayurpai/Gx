import spacy

nlp = spacy.load('en_core_web_sm')
doc = nlp(u'Charles Spencer Chaplin was born on 16 April 1889 toHannah Chaplin (born Hannah Harriet Pedlingham Hill) and Charles Chaplin Sr')

for token in doc:
    print(token.text, token.lemma_, token.pos_, token.shape_, token.is_alpha, token.is_stop)
