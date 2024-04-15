#!/usr/bin/env python
# coding: utf-8
import json
import xml.etree.ElementTree as et

class MovieSerializer:
    
    __fmt_dictionary = {}
    
    def __init__(self, fmt, serializer_fn):
        self.__fmt_dictionary[fmt] = serializer_fn
    
    @classmethod
    def serialize(cls, movie, fmt):
        
        if fmt not in cls.__fmt_dictionary:
            raise ValueError(fmt)
        
        serializer_fn = cls.__fmt_dictionary[fmt]
        
        
        return serializer_fn(movie)


class JSONMovieSerializer(MovieSerializer):
    
    def __init__(self):
        MovieSerializer.__init__(self, 'JSON', self._serialize_to_json)
    
    def _serialize_to_json(self, movie):
        
        movie_info = {
                'id': movie.movie_id,
                'name': movie.name,
                'director': movie.director
            }

        return json.dumps(movie_info)


class XMLMovieSerializer(MovieSerializer):
    
    def __init__(self):
        MovieSerializer.__init__(self, 'XML', self._serialize_to_xml)
    
    def _serialize_to_xml(self, movie):
        movie_element = et.Element('movie', attrib={'id': movie.movie_id})

        name = et.SubElement(movie_element, 'name')
        name.text = movie.name
        
        director = et.SubElement(movie_element, 'director')
        director.text = movie.director
        
        return et.tostring(movie_element, encoding='unicode')



JSONMovieSerializer()

XMLMovieSerializer()
