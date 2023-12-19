import tkinter as tk #UI 
from tkinter import filedialog
import index

def chooseDialog():
    file: str = filedialog.askdirectory(title="Please choose the path")
    return file

def downloadControl():
    val = index.download(path=chooseDialog(), cat="mp4", entry=entry)


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
#labelDir.pack()

#Field about the path
fieldNoEntryPath = tk.Entry(root)
fieldNoEntryPath.config(width=40)
fieldNoEntryPath.config(state=tk.DISABLED)
#fieldNoEntryPath.pack()

#Button to choose a folder
buttonPath = tk.Button(root, text="Choose a folder.", command=chooseDialog)
#buttonPath.pack()

#Label to say the user
labelName = tk.Label(root, text="Write what you want the video to be called (Optional):")
labelName.pack()

#Field to the name
fieldName = tk.Entry(root)
fieldName.config(width=40)
fieldName.pack()

#Download
button = tk.Button(root, text='Download!', command=lambda: downloadControl)
button.pack()

label = tk.Label(root, text="Youtube Downloader")
label.pack()

root.mainloop()