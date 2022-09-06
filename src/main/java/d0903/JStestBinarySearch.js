var ns=[1,2,3,4,5,6];
var numbers = ns.slice(0,5);
console.log(numbers)

function search(ns,num) {
    var midIndex = ns.length/2;
    var midNum = ns[ns.length/2]
    if(num===midNum){
        return midNum;
    }else if(num>midNum){
        search(ns.slice(0,4),num)
    }else{
        search(ns.slice(midIndex,ns.length-1),num)
    }
}

var  search1 = search([1,2,3,4,5,6],5);
console.log(search1)