alert("Admin Reg")

export class Student{
    
    constructor(id,name,address,marks){
        this.id=id;
        this.name=name;
        this.address=address;
        this.marks=marks;

    }

    printData(){
        return this.id+","+this.name+"," +this.address+","+this.marks;
    }
}