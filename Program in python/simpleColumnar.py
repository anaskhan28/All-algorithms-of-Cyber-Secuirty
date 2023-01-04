def columnar_encrypt(plaintext, key):
    # Convert the plaintext to uppercase and remove non-alphabetic characters
    plaintext = ''.join(c for c in plaintext.upper() if c.isalpha())

    # Convert the key to a list of integers
    key = [ord(c) - 65 for c in key.upper()]

    # Compute the number of rows and columns
    rows = len(plaintext) // len(key)
    if len(plaintext) % len(key) > 0:
        rows += 1
    cols = len(key)

    # Create an empty grid
    grid = []
    for i in range(rows):
        grid.append([''] * cols)

    # Populate the grid with the characters of the plaintext
    for i, c in enumerate(plaintext):
        row = i // cols
        col = i % cols
        grid[row][col] = c

    # Read the grid in the order specified by the key to obtain the ciphertext
    ciphertext = ''
    for i in key:
        for row in grid:
            ciphertext += row[i]

    return ciphertext
