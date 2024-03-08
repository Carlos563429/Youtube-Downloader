import re
from pytube import YouTube

def download(path: str, cat: str, link: str, name: str):
    if link == "": return 0 #Entry empty
    elif path == "" or path == None: return 2
    elif cat == "": return 3
    else:
        #Get the video
        print("Something")

        try:
            name = re.sub(pattern=r'[^\-_\w\. ]', repl=' ', string=name)

            yt = YouTube(url=link)

            if name == "": name = re.sub(pattern=r'[^\-_\w\. ]', repl='_', string=yt.title)
            
            match cat:
                case "MP4: 144p":
                    n = 144
                    ext = "mp4"
                case "MP4: 240p":
                    n = 240
                    ext = "mp4"
                case "MP4: 360p":
                    n = 360
                    ext = "mp4"
                case "MP4: 720p":
                    n = 720
                    ext = "mp4"
                case "MP4: 1080p":
                    n = 1080
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

            if cat == "MP4: Highest resolution":
                stream = yt.streams.get_highest_resolution()
                ext = "mp4"
            elif ext == "mp4":
                stream = yt.streams.get_by_resolution(n)
            else:
                stream = yt.streams.get_by_itag(n)

            stream.download(output_path=path, filename=f"{name}.{ext}")

            return 1

        except Exception as e:
            return e
    
    
