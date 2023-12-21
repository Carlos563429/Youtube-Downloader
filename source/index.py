import re
import tkinter
from pytube import YouTube
import pytube
import UI

def download(path: str, cat: str, link: str, name: str):
    if link == "": return 0 #Entry empty
    elif path == "" or path == None: return 2
    elif cat == "": return 3
    else:
        #Get the video
        print("Something")

        try:
            name = re.sub(pattern=r'[^\-_\w\.]', repl='_', string=name)

            yt = YouTube(url=link)
            
            match cat:
                case "MP4: 360p":
                    n = 18
                    ext = "mp4"
                case "MP4: 720p":
                    n = 22
                    ext = "mp4"
                case "MP4: 1080p":
                    n = 137
                    ext = "mp4"
                case "MP3: 128kbps":
                    n = 140
                    ext = "mp3"
                case "MP3: 50kbps":
                    n = 249
                    ext = "mp3"
                case "MP3: 70kbps":
                    n = 250
                    ext = "mp3"
                case "MP3: 160kbps":
                    n = 251
                    ext = "mp3"

            stream = yt.streams.get_by_itag(n)

            if name == "": name = re.sub(pattern=r'[^\-_\w\.]', repl='', string=yt.title)

            stream.download(output_path=path, filename=f"{name}.{ext}")

            return 1

        except Exception as e:
            return e
    
    
