export const clean = (phone) => {
  phone = phone.replace(new RegExp(/[\(\)\.\+-]|[ ]/, "gi"), "");
  if (/[a-z]/gi.test(phone)) {
    throw new Error("Letters not permitted");
  }

  if (/[^\d]/g.test(phone)) {
    throw new Error("Punctuations not permitted");
  }

  if (phone.length < 10) {
    throw new Error("Must not be fewer than 10 digits");
  }

  if ((phone.length === 10 && phone[0] === "0") || (phone.length === 11 && phone[1] === "0")) {
    throw new Error("Area code cannot start with zero");
  }

  if ((phone.length === 10 && phone[0] === "1") || (phone.length === 11 && phone[1] === "1")) {
    throw new Error("Area code cannot start with one");
  }

  if ((phone.length === 10 && phone[3] === "0") || (phone.length === 11 && phone[4] === "0")) {
    throw new Error("Exchange code cannot start with zero");
  }

  if ((phone.length === 10 && phone[3] === "1") || (phone.length === 11 && phone[4] === "1")) {
    throw new Error("Exchange code cannot start with one");
  }

  if (phone.length === 11) {
    if (phone[0] !== "1"){
        throw new Error("11 digits must start with 1");
    }
    phone = phone.slice(1);
  }

  if (phone.length > 11) {
    throw new Error("Must not be greater than 11 digits");
  }
  return phone;
};
