import { Button } from '@mui/material';
import axios from 'axios';

const App = () => {
  const onClickFetchQuestionButton = async () => {
    const response = await axios.get("http://{IP}:8080/api/1",{
      headers:{
        'Access-Control-Allow-Origin' : '{IP}:8080'
      },
      withCredentials: true
    })
    console.log(response)
  }
  
  return (
    <div style={{width:"max-width", marginLeft:"200px", marginRight:"200px", flexDirection:"column", display:"flex", justifyContent:"center", alignItems:"center"}}>
      <div style={{display:"flex", "justifyContent": "space-between", width:"150px", justifyContent:"center"}}>
        <Button onClick={onClickFetchQuestionButton}>Login</Button>
      </div>
    </div>
  );
}



export default App;
