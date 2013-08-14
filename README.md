If you're trying to auto wire a collection with annotations, then use @Resource instead of @Autowired.

In order to satisfy an @Autowired collection dependency, the IoC container looks for elements of the right type to build such a collection from.
In other words, it does not look for the collection itself, but rather builds a collection out of other beans.