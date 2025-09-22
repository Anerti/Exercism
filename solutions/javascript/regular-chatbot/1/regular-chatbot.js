export function isValidCommand(command) {
  return new RegExp('chatbot', 'i')
    .test(command.split(/[^\w]/)
    .filter(Boolean)[0]);
}

export function removeEmoji(message) {
  return message.replace(/emoji\d*/gi, "");
}

export function checkPhoneNumber(number) {
  if (/\(\+\d{2}\)[ ]\d{3}-\d{3}-\d{3}/.test(number)){
    return "Thanks! You can now download me to your phone.";
  }
  return `Oops, it seems like I can't reach out to ${number}`;
}

export function getURL(userInput) {
  return userInput.match(new RegExp(/\w+\.\w+/, 'gi'));
}

/**
 * Greet the user using the full name data from the profile.
 *
 * @param {string} fullName
 * @returns {string} Greeting from the chatbot
 */
export function niceToMeetYou(fullName) {
  return "Nice to meet you, " + 
    fullName.split(", ")[1] + " " + 
    fullName.split(", ")[0];
}
