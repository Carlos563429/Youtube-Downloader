import re
import tkinter
from pytube import YouTube
import pytube
import UI

def download(path: str, cat: str, link: str, name: str):
    if link == "":
        return 0 #Entry empty
    else:
        #Get the video
        print("Something")

        try:
            name = re.sub(r'[^\\w\\-_\\. ]', '_', name)

            yt = YouTube(url=link)
            stream = yt.streams.get_by_itag(22)

            stream.download(output_path=path, filename=f"{name}.{cat}")

            return 1

        except NameError:
            return NameError.name
    
    
