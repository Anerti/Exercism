export const flatten = (data) =>
    data.filter(e => e != null)
        .flatMap(e => typeof e === 'object' ? flatten(e) : e);