import tkinter
from pytube import YouTube
import pytube
import UI

def download(path: str, cat: str, entry: tkinter.Entry):
    if entry.get() == "":
        return 0 #Entry empty