import os
from pytube import YouTube


file = open("no_editar.sync")
line = file.read()

lista = line.split(";")

path = lista[0]
link = lista[1]

print(lista)

yt = YouTube(link)

path_downloads = os.path.join(os.path.join(os.environ['USERPROFILE']), 'Downloads')

stream = yt.streams.get_by_itag(22)

stream.download(path)

a = yt.views

print(a)
#print(stream.download.output_path)