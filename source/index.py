import os
from pytube import YouTube
import tkinter as tk #UI 
from tkinter import filedialog


#Script
def saveLink():
    #Get the text

    link = entry.get()

    yt = YouTube(link)

    global path_downloads
    path_downloads = os.path.join(os.path.join(os.environ['USERPROFILE']), 'Downloads')

    stream = yt.streams.get_by_itag(22)

    stream.download(dirname)

def saveDirectory():
    #Get the dir
    global dirname
    dirname = filedialog.askdirectory(title='Choose a dir')

    if dirname == "":
        dirname = path_downloads

    fieldNoEntryPath.config(state=tk.NORMAL)
    fieldNoEntryPath.insert(0, dirname)
    fieldNoEntryPath.config(state=tk.DISABLED)

#UI
root = tk.Tk()
root.title('Youtube Downloader')
root.geometry('400x200')

#Label
labelLink = tk.Label(root, text="Paste the YT link here:")
labelLink.pack()

#Text Field
entry = tk.Entry(root)
entry.config(width=40)
entry.pack()

#Label path
labelDir = tk.Label(root, text="Choose a destination folder:")
labelDir.pack()

#Field about the path
fieldNoEntryPath = tk.Entry(root)
fieldNoEntryPath.config(width=40)
fieldNoEntryPath.config(state=tk.DISABLED)
fieldNoEntryPath.pack()

#Button to choose a folder
buttonPath = tk.Button(root, text="Choose a folder.", command=saveDirectory)
buttonPath.pack()

#Download
button = tk.Button(root, text='Download!', command=saveLink)
button.pack()

label = tk.Label(root, text="Youtube Downloader")
label.pack()

root.mainloop()