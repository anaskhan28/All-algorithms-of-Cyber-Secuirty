function Encrypt(plainTxt, num=3) {
    let LowerPlainText = plainTxt.toLowerCase();
    let alphabets = 'abcdefghijklmnopqrstuvwxyz'.split('');
    console.log(alphabets);
    let result = '';
    for (let i = 0; i < LowerPlainText.length; i++) {
        let letter = LowerPlainText[i];
        if (letter === ' ') {
            result += letter;
            continue;
        }
        let currentStr = alphabets.indexOf(letter);
        let newStr = currentStr + num;
        if (newStr > 25) newStr = newStr - 26;
        if (newStr < 0) newStr = 26 + newStr;
        if (plainTxt[i] === plainTxt[i].toUpperCase()) {
            result += alphabets[newStr].toUpperCase();
        } else result += alphabets[newStr];
    }
    return result;
}

function Decrypt(CipherTxt , num=3){
    let LowerCipherTxt = CipherTxt.toLowerCase();
    let alphabets = 'abcdefghijklmnopqrstuvwxyz'.split('');
    let result = '';
    for (let i = 0; i < LowerCipherTxt.length; i++) {
        let letter = LowerCipherTxt[i];
        if (letter === ' ') {
            result += letter;
            continue;
        }
        let currentStr = alphabets.indexOf(letter);
        let newStr = currentStr - num;
        if (newStr > 25) newStr = newStr - 26;
        if (newStr < 0) newStr = 26 + newStr;
        if (CipherTxt[i] === CipherTxt[i].toUpperCase()) {
            result += alphabets[newStr].toUpperCase();
        } else result += alphabets[newStr];
    }
    return result;
}

