import os
from pytube import YouTube

yt = YouTube("https://youtu.be/UGWYDZ8YWmc")
path_downloads = os.path.join(os.path.join(os.environ['USERPROFILE']), 'Downloads')

stream = yt.streams.get_by_itag(22)

stream.download(path_downloads)


a = yt.views


print(a)
#print(stream.download.output_path)