 export const score = (x, y) => {
   const landingPoint = Math.sqrt((x**2) + (y**2));
   
   return (landingPoint > 10) ? 0 
     : (landingPoint > 5 && landingPoint <= 10) ? 1
     : (landingPoint > 1 && landingPoint <= 5) ? 5
     : 10;
 } 
