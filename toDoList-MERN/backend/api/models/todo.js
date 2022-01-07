import Mongoose from "mongoose";
let date = new Date()
//this basically tells schema of format
const todoSchema = new Mongoose.Schema({
    title:{
        type:String,
    },
    description:{
        type:String 
    },
    dueDate: {
        type: String,
        default:date.toDateString()
    },
    dueTime: {
        type: String,
        default:date.toLocaleTimeString()
    },
    completed: {
        type: Boolean,
        default: false
    } //this is to add schema format ,deafult type is also defined
},
{
    versionKey: false
});

todoSchema.virtual('id', () => this._id.toHexString());
todoSchema.set('toJSON', {virtuals: true});

const Todo = Mongoose.model('Todo', todoSchema); //to add schema 

export default Todo;