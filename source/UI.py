"""
    The main UI in them protoversion
"""

import flet as ft
import yt_main

class UI():
    async def main(page: ft.Page):
        await page.add_async()

        downloadButtonStyle = ft.ButtonStyle(color=ft.colors.RED_800)

        downloadButton = ft.TextButton(text="⚡Download!⚡", 
                                       style=downloadButtonStyle,
                                       on_click=yt_main.download)
        
        linkField = ft.TextField(text_align=ft.TextAlign.LEFT,
                                 value="Enter a youtube link here")
        
        await page.add_async(
            ft.Column(
                [linkField,
                 downloadButton]
            )
        )

    ft.app(target=main, name="Youtube Downloader", view=ft.AppView.FLET_APP)

UI()