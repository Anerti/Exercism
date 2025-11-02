export const cookingStatus = remainingTime =>
    remainingTime === 0 ? 'Lasagna is done.'
        : remainingTime == null ? 'You forgot to set the timer.'
        : 'Not done, please wait.'

export const preparationTime = (layers, time = 2) => layers.length * time;

export const quantities = layers => {
    return {
        noodles: layers.filter(e => e === 'noodles').length * 50,
        sauce: layers.filter(e => e === 'sauce').length * 0.2
    }
}

export const addSecretIngredient = (ingredient1, ingredient2) => {
  ingredient2.push(ingredient1[ingredient1.length - 1]);
}

export const scaleRecipe = (recipe, portionNumber) => {
  let newRecipe = {};
  for (const key of Object.keys(recipe))
      newRecipe[key] = recipe[key] * portionNumber / 2;
  return newRecipe;
}
  