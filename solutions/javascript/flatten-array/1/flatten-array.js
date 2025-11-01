export const flatten = (data) => 
  data.join(',')
  .split(',')
  .filter(e => e != null || e !== undefined)
  .filter(Boolean)
  .map(e => +e);
