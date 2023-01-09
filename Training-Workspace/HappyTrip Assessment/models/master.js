class City {
  constructor(id, code, name, country) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.country = country
  }
}

class Route {
  constructor(fromCity, toCity, distance) {
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.distance = distance;
  }
}

export { City };
