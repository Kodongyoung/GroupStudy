const newAGroup = (momAGroup) => console.log("AGOUP : " + momAGroup)
const newBGroup = (momBGroup) => console.log("BGROUP : " + momBGroup)

function TeamRand(){
    
    let allMemberA = [ "고동영", "장해솔", "류슬기", "박재민", "한다은",
    "최현정", "오진욱", "조진형", "이정현"]

    let allMemberB = ["이범진", "박소현", "탁성진", "노찬욱",
    "박기범", "하진주", "이승윤", "최임식"]
    
    const firstA = []
    const secondA = []
    const MAX = 5
    const MIN = 4
    const INAMAX = 9
    const INBMAX = 8
    const INMIN = 1
    const NUM = 4
    let i
    let teamARandNum =Math.floor(Math.random()*(MAX-MIN+1))+MIN;
    
    console.log(teamARandNum)
    
    for(i = 0; i < teamARandNum;i++){
    
        const aJoRandom =Math.floor(Math.random()*(INAMAX-INMIN-i))+INMIN
        //console.log(aJoRandom)
        firstA.push(allMemberA[aJoRandom])
        //console.log(first)
        allMemberA.splice(aJoRandom,1);
        
    }
        newAGroup(firstA)
        newBGroup(allMemberA)


    for(i = 0; i < NUM;i++){
    
        const bJoRandom =Math.floor(Math.random()*(INBMAX-INMIN-i))+INMIN
        //console.log(aJoRandom)
        secondA.push(allMemberB[bJoRandom])
        //console.log(first)
        allMemberB.splice(bJoRandom,1);       
    }
        newAGroup(secondA)
        newBGroup(allMemberB)

    return (
        <div className="TeamRand">
            <p>
            TeamRand
            </p>
            {/* <button onClick="document.getElementById('demo').innerHTML">팀다시짜기</button>
            <p id ="demo">재실행</p>
            <script>
                TeamRand()
            </script>
             */}
           
            
        </div>
    )
}
{/* <button onclick="document.getElementById('demo').innerHTML = getRndInteger(4,5)">
    
    Click Me
    
    </button>

<p id="demo"></p> */}
    export default TeamRand