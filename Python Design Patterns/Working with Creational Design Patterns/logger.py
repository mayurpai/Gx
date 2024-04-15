#!/usr/bin/env python
# coding: utf-8

DEBUG = 'debug'
INFO = 'info'
WARNING = 'warning'
ERROR = 'error'

class Logger:
    
    def __init__(self, name):
        print('Logger initialized: ', name)
        
    def log(self, message):
        print('Imagine that this logs the message to some output')



class __ConsoleLogger(Logger):

    def __init__(self, name):
        Logger.__init__(self, name)
        
    def log(self, message):
        print('Logging on the console:', message)


class __FileLogger(Logger):

    def __init__(self, name):
        Logger.__init__(self, name)
        
    def log(self, message):
        print('Logging to a file:', message)


CONSOLE_LOGGER = __ConsoleLogger('console')

FILE_LOGGER = __FileLogger('file')
