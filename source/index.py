import os
import time
import webbrowser
from pytube import YouTube
import tkinter as tk #UI 
from tkinter import filedialog

#Variables
dirname = None

#Script
def saveLink():
    #Local variables
    nameDir = dirname

    #Get the name
    fileName = fieldName.get()

    print(fileName)

    if len(fileName) > 0:
        fileName = fileName + ".mp4"

    #Get the text
    link = entry.get()

    # Get the video
    yt = YouTube(link, use_oauth=True, allow_oauth_cache=True)

    #Open de oauth
    authorization_url = yt.get_authorization_url()

    webbrowser.open(authorization_url)

    global path_downloads
    path_downloads = os.path.join(os.path.join(os.environ['USERPROFILE']), 'Downloads')

    if nameDir == None:
        nameDir = path_downloads

    stream = yt.streams.get_by_itag(22)

    stream.download(output_path=nameDir, filename=fileName)

    yt.register_on_complete_callback(onComplete)

def saveDirectory():
    #Get the dir
    dirname = filedialog.askdirectory(title='Choose a dir')

    fieldNoEntryPath.config(state=tk.NORMAL)
    fieldNoEntryPath.insert(0, dirname)
    fieldNoEntryPath.config(state=tk.DISABLED)

def onComplete():
    label.config(text="Video Descargado!!!")

    time.sleep(5)

def shutDown():
    os.system("shutdown /s /t 1")

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

#Label to say the user
labelName = tk.Label(root, text="Write what you want the video to be called (Optional):")
labelName.pack()

#Field to the name
fieldName = tk.Entry(root)
fieldName.config(width=40)
fieldName.pack()

#Download
button = tk.Button(root, text='Download!', command=saveLink)
button.pack()

label = tk.Label(root, text="Youtube Downloader")
label.pack()

labelNotImportant = tk.Label(root, text="")
labelNotImportant.pack()

#Shut down the pc
buttonShutDown = tk.Button(root, text='ShutDown PC', command=shutDown)
buttonShutDown.pack()

root.mainloop()