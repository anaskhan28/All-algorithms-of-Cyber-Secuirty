def vernam_cipher(text, key):
    # make sure the key is as long as the text
    key = key * (len(text) // len(key) + 1)
    key = key[:len(text)]
    
    # convert the text and key to a list of integers
    text_int = [ord(x) for x in text]
    key_int = [ord(x) for x in key]
    
    # perform the XOR operation on each pair of text and key integers
    encrypted_int = [text_int[i] ^ key_int[i] for i in range(len(text_int))]
    
    # convert the encrypted integers back to a string
    encrypted_text = ''.join([chr(x) for x in encrypted_int])
    
    return encrypted_text

# test the cipher
text = "HELLO"
key = "SECRET"
encrypted_text = vernam_cipher(text, key)
print(encrypted_text)  # prints something like "]\x1c\x1f\x1e\x1d"

# test the decryption
decrypted_text = vernam_cipher(encrypted_text, key)
print(decrypted_text)  # prints "HELLO"