
# take two large prime numbers
p = 25
g = 7


shirley_private_key = 6
anas_private_key = 15

# generate public key 
shirley_public_key = (g ** shirley_private_key) % p
anas_public_key = (g ** anas_private_key) % p

# both exchanges the public key

# now generate a shared key
shirley_shared_secret = (anas_public_key ** shirley_private_key) % p
anas_shared_secret = (shirley_public_key ** anas_private_key) % p

# The shared secret key computed by Alice and Bob should be the same
assert shirley_shared_secret == anas_shared_secret
print(shirley_shared_secret)

