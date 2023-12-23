import tkinter as tk #UI 
from tkinter import filedialog
from tkinter import messagebox
from tkinter.ttk import Combobox
import index

def chooseDialog():
    file: str = filedialog.askdirectory(title="Please choose the path")
    return file

def downloadControl():
    label.config(text="Downloading... Please Wait. DONT SCARED")
    file = chooseDialog()
    val = index.download(path=file, cat=catVar.get(), link=entry.get(), name=fieldName.get())

    #Notification CONTROL
    match val:
        case 0:
            messagebox.showwarning(title=f"Error {val}", message="Entry empty\nYou have to write your Youtube video link")
        case 1:
            messagebox.showinfo(title="Congratulations!", message=f"Your download is ready!\nPath: {file}")
        case 2:
            return
        case 3:
            messagebox.showerror(title=f"Error {val}", message="Please choose an extension")
        case _:
            messagebox.showerror(title="Unknow error", message=f"You get the following error:\n{val}")
            
    label.config(text="Youtube Downloader")
    entry.insert(0, "")

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

#Label to say the user
labelName = tk.Label(root, text="Write what you want the video to be called (Optional):")
labelName.pack()

#Field to the name
fieldName = tk.Entry(root)
fieldName.config(width=40)
fieldName.pack()

labelCat = tk.Label(root, text="Choose the format:")
labelCat.pack()

#Combobox for choose mp4 or mp3
catVar = tk.StringVar()
comboCat = Combobox(root, textvariable=catVar, values=("MP4: 144p", "MP4: 240p", "MP4: 360p", "MP4: 720p", "MP4: 1080p", "MP4: Highest resolution",
                                                       "MP3: 128kbps", "MP3: 50kbps", "MP3: 70kbps", "MP3: 160kbps"), state='readonly')
comboCat.config(width=37)
comboCat.pack()

#Download
button = tk.Button(root, text='Download!', command=lambda: downloadControl())
button.pack()

label = tk.Label(root, text="Youtube Downloader")
label.pack()

root.mainloop()