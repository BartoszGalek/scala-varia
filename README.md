# scala-varia

# fold
    allows to get a result in a different type then the one of List element
    
    foldLeft and fold are pretty much interchangable, the difference is that the fold does not assume the sequence
    
    foldRight is a bit different, it will be executed in a totally different order and the parameters to the function will be also in a different order then fold
    
    
# reduce
    allows to get a result without initial value.
    the result will be the same type as the Collesction element
    
    reduceLeft guarantees the order and has a similliar parameters as reduce
    reduce does not guarantee the sequence
    reduceRight just like foldRight executes the given function in a reverse order
    
# for comprehension
    syntactic sugar - removes unnecessary loops
    makes looping much more stright forward
    variables from line above can be used in theline below 