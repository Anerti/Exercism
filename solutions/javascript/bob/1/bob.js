const isUpper = text =>{
    try{
        return text.split(/[^A-Za-z]/).join("").match(/[A-Z]+/g)[0] ===
            text.split(/[^A-Za-z]/).join("").toUpperCase();
    }
    catch(err){
        return false;
    }
}

export const hey = message => {
    message = message.replaceAll(/\s/g, "");
    return message.endsWith("?") && isUpper(message) ? "Calm down, I know what I'm doing!" :
        message.endsWith("?") ? "Sure." :
         isUpper(message) ? "Whoa, chill out!" :
        message === "" ? "Fine. Be that way!" :
        "Whatever.";
};

