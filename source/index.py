import os
import time
from pytube import YouTube

#file = open("no_editar.sync")
#line = file.read()

#lista = line.split(";")

#path = lista[0]
#link = lista[1]

#print(lista)

link = input()

yt = YouTube(link)

path_downloads = os.path.join(os.path.join(os.environ['USERPROFILE']), 'Downloads')

stream = yt.streams.get_by_itag(22)

print("Descargando, favor espera...")

time.sleep(2)

print("Es posible que tengas mal inter...")

stream.download(path_downloads)

a = yt.views

print("¡Descargado! ¡Revisa en tu carpeta de descargas!")

print("Views: ",a)
#print(stream.download.output_path)