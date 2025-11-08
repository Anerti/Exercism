const OrbitalPeriodInEarthYear = planet => {
    switch (planet.toLowerCase()){
        case 'mercury': return 0.2408467;
        case 'venus': return 0.61519726;
        case 'earth': return 1.0;
        case 'mars': return 1.8808158;
        case 'jupiter': return 11.862615;
        case 'saturn': return 29.447498;
        case 'uranus': return 84.016846;
        case 'neptune': return 164.79132;
        default: throw new Error('not a planet');
    }
}

export const age = (planet, time) => 
  +(time / (24 * 3600 * 365.25 * OrbitalPeriodInEarthYear(planet))).toFixed(2);