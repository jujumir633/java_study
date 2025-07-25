package com.kosmo.advance.ex;

public class S08Socket {
    /*

■ 인터넷과 소켓에서 이용하는 인터넷 망과 연결성 통신

⸻

1. 인터넷이란?

인터넷은 전 세계 수많은 컴퓨터와 장치들을 연결하는 거대한 네트워크입니다.
이때 연결을 가능하게 하는 건 단순한 물리적 선(케이블)만이 아니라, **데이터를 주고받는 규칙(프로토콜)**과 **통신 구조(모델)**도 포함됩니다.

⸻

2. 이 연결은 어떤 망을 통해 이루어질까?

인터넷이라는 거대한 망은 여러 종류의 **네트워크(Network)**들이 연결되어 만들어집니다. 대표적인 망 구조는 다음과 같습니다:
	•	LAN (Local Area Network)
        집, 학교, 사무실 등에서 사용하는 근거리 통신망입니다.
        예: 같은 공유기에 연결된 노트북과 프린터
	•	WAN (Wide Area Network)
        LAN을 서로 연결한 광역 통신망으로, 인터넷도 WAN의 일종입니다.
        예: 서울과 부산의 두 기업 서버 간 연결
	•	ISP 망 (KT, SK 등)
        LAN과 WAN을 연결시켜주는 인터넷 서비스 제공자의 네트워크입니다.

⸻

3. 이런 네트워크 간에 실제 연결은 어떻게 이루어질까?

**연결성(Connectivity)**은 두 장치(혹은 프로그램)가 서로 데이터를 송수신할 수 있는 상태를 의미합니다. 이 연결성을 위해서는 다음 3가지 요소가 필요합니다:
    •	IP 주소
        각 장치의 네트워크 상 주소 (전화번호처럼 고유함)
    •	포트 번호
        한 컴퓨터 내에서 여러 프로그램을 구분하기 위한 번호
    •	프로토콜(Protocol)
        데이터를 주고받는 약속 (예: TCP, UDP)

⸻

4. 소켓(Socket)이란?

“소켓은 IP와 포트를 이용해 네트워크 연결을 맺고, 데이터를 주고받을 수 있도록 해주는 프로그래밍 인터페이스(혹은 API)입니다.”
**API (Application Programming Interface) 프로그램과 프로그램 사이의 약속된 사용 방법 입니다.

쉽게 말해:
	•	네트워크라는 도로가 있고
	•	IP와 포트라는 집주소가 있다면
	•	소켓은 그 집에서 손님(데이터)을 주고받는 문 역할입니다.

즉, 소켓은 인터넷망(LAN/WAN)을 통해 연결된 장치 간의 통신을 가능하게 하는 연결점입니다.

⸻

5. 소켓은 어떻게 통신하는가?

소켓은 두 가지 방식으로 통신합니다.
이건 결국 전송 방식의 차이, 즉 TCP냐 UDP냐로 나뉘게 됩니다.

- TCP 소켓 (연결지향형)
	•	데이터를 보내기 전에 서버와 클라이언트가 먼저 연결을 맺음
	•	신뢰성 있는 전송 (데이터 손실/순서 오류 없음)
	•	예: 웹 브라우징, 파일 전송

- UDP 소켓 (비연결지향형)
	•	연결 없이 바로 데이터 전송
	•	빠르지만 신뢰성 낮음
	•	예: 게임, 스트리밍, 실시간 채팅

⸻

6. 이 모든 통신은 어떤 구조로 이루어질까?

소켓은 실제로는 TCP/IP 프로토콜 스택(4계층) 위에서 동작합니다.
	•	응용 계층: HTTP, FTP 등 (우리가 만든 애플리케이션 코드)
	•	전송 계층: TCP/UDP (소켓 통신이 여기에 해당)
	•	인터넷 계층: IP (주소와 라우팅)
	•	네트워크 계층: Ethernet, Wi-Fi 등 (물리 전송)

→ 우리가 소켓을 이용해 데이터를 보낼 때 실제로는 이 계층들을 따라 네트워크를 타고 가는 겁니다.

⸻

7. 예시로 보는 전체 흐름

내가 만든 채팅 프로그램(클라이언트)이 상대방 컴퓨터(서버)와 메시지를 주고받는 경우:

	•	인터넷에 연결된 LAN 환경에서 (예: 와이파이)
	•	상대방의 IP와 포트를 이용해 소켓으로 연결을 시도
	•	TCP 소켓을 통해 안전한 연결 수립 (3-way handshake)
	•	연결되면 메시지를 InputStream/OutputStream으로 주고받음
	•	연결 종료 시 소켓 close()

⸻

■ 3-Way Handshake란?
TCP 통신에서 클라이언트와 서버가 연결을 시작할 때 서로의 연결 가능성을 확인하고 안정적인 통신을 약속하기 위한 절차입니다.
즉, 데이터를 보내기 전에 **“연결할 준비가 되었는지 서로 확인하고 합의하는 과정”**입니다.
⸻
■ 그림으로 표현

[Client]                              [Server]
   | --------- SYN  (시작 요청) --------> |  SYN_SENT : 클라이언트가 서버에 “접속 요청합니다!”
   |                                     |
   | <---- SYN + ACK (수락 + 시작요청) -- | SYN_RECEIVED : 서버가 요청을 수락하며 응답을 보냅니다  “그래, 접속할 준비 됐어. 너 준비됐니?”
   |                                     |
   | --------- ACK (수락) -------------> | All ESTABLISHED :클라이언트가 “응, 나도 준비 완료!”라고 응답
   |                                     |
[연결 완료]                       [연결 완료]



■ 자바와의 연결

자바에서 TCP 소켓을 이용할 때 Socket 또는 ServerSocket을 사용하면 내부적으로 이 3-way handshake가 자동으로 수행됩니다.

// 서버
ServerSocket server = new ServerSocket(9999);
Socket clientSocket = server.accept();  // 여기서 handshake 시작됨

// 클라이언트
Socket socket = new Socket("192.168.0.10", 9999);  // 여기서 SYN 요청이 발생

→ 우리가 코드를 작성하지 않아도,
→ 소켓 객체 생성 순간에 이미 3-way handshake를 통해 연결이 성립된 것입니다.

⸻

■ 요약 정리

1단계: 클라이언트 → 서버    (SYN)       → 연결 요청
2단계: 서버 → 클라이언트    (SYN + ACK) → 요청 수락 + 연결 요청
3단계: 클라이언트 → 서버    (ACK)       → 연결 수락

→ 양쪽이 모두 연결되었음을 확정 → 데이터 송수신 가능


⸻

■ 요약
	•	인터넷 망은 LAN/WAN/ISP 등의 구조로 이루어지며, 장치들은 IP/Port/Protocol로 연결됩니다.
	•	소켓은 이런 네트워크 연결성을 활용하여 두 프로그램 간 데이터 통신을 가능하게 합니다.
	•	소켓 통신은 TCP/UDP 방식에 따라 다르며, 모두 TCP/IP 네트워크 모델 기반에서 동작합니다.
	•	결국 소켓은 인터넷 기반 네트워크를 활용한 프로그래밍 방식 중 가장 기본적이며 중요한 연결 수단입니다.

⸻


■ 왜 우리가 만드는 자바 소켓은 LAN 환경에서만 연결되는가?

⸻

1. 우리가 만든 자바 소켓 프로그램은 어디에서 실행되는가?
	•	예: ServerSocket server = new ServerSocket(9999);
	•	이 말은 내 컴퓨터의 IP주소:9999 포트를 열어두고 기다리겠다는 의미입니다.

    그런데 이 IP 주소가 어떤 IP냐에 따라 연결 가능성이 달라집니다.

⸻

2. LAN 환경에서는 내부 IP로 연결이 된다

▸ LAN에서는 일반적으로 이런 IP를 사용합니다:
	•	192.168.x.x
	•	10.x.x.x
	•	172.16.x.x ~ 172.31.x.x

    이러한 IP들은 **사설 IP(Private IP)**라고 불리며, 공유기 안에서만 통신이 가능합니다.
    즉, 같은 공유기나 와이파이에 연결된 기기들끼리는
    → 서로의 사설 IP 주소를 통해 직접 통신할 수 있습니다.

    그래서 LAN 환경에서는 소켓 연결이 잘 됩니다.

⸻

3. 하지만 외부에서 접속하려고 하면 문제가 생긴다

▸ 인터넷에서 연결하려면 **공인 IP(Public IP)**가 필요합니다.
	•	외부 컴퓨터는 우리 집 공유기의 내부 사설 IP를 모릅니다.
	•	심지어 사설 IP는 인터넷 망에서 접근이 불가능합니다. → 그래서 외부에서는 서버에 직접 접근할 수 없습니다.

⸻

4. 왜 그럴까? NAT와 방화벽이 존재하기 때문입니다

▸ NAT (Network Address Translation)
	•	공유기에는 공인 IP 하나만 있고, 내부에서는 여러 사설 IP를 씁니다.
	•	NAT는 외부로 나가는 요청은 번역해주지만, 외부에서 들어오는 요청은 허용하지 않습니다.
	•	즉, 외부 클라이언트가 192.168.0.10:9999로 직접 접근할 수 없습니다.

▸ 방화벽
	•	운영체제 또는 공유기 자체에서 외부 접근을 막고 있을 수 있습니다.
	•	서버 포트를 외부에서 접근 가능하도록 열어주지 않으면 연결되지 않습니다.

⸻

5. 그래서 LAN이 아니면 자바 소켓 통신이 막히는 것이다

기본적으로 자바 소켓은 IP 주소와 포트로만 연결하려고 시도합니다.
이 주소가 사설 IP이고, NAT나 방화벽에 의해 막혀 있다면 외부에서는 연결할 수 없습니다.

⸻

6. 해결 방법은 무엇인가?

1) 포트 포워딩(Port Forwarding)
	•	공유기 설정에서 9999 포트를 내부 IP(예: 192.168.0.10)에 매핑
	•	외부에서 공인IP:9999로 접근하면 NAT가 내부 서버로 연결해줌

2) 공인 서버 사용
	•	AWS, 클라우드 서버, 외부 공인 IP를 가진 서버를 사용
	•	서버가 공인 IP를 가지므로 누구든 접근 가능

3) 터널링 서비스 활용 (예: ngrok)
	•	내 로컬에서 테스트할 때 ngrok으로 외부에 포트를 임시로 열 수 있음

⸻

7. 결론
	•	LAN 안에서는 사설 IP 기반으로 소켓 통신이 가능하기 때문에 문제가 없음
	•	그러나 LAN 밖에서는 공유기, NAT, 방화벽 때문에 직접 접속이 차단됨
	•	이를 해결하려면 공인 IP 확보, 포트 포워딩, 서버 호스팅 등의 조치가 필요함

⸻


■ 내 컴퓨터의 IP 주소 확인 방법 (OSX, Windows)

⸻

- IP 주소란?

IP 주소는 네트워크 상에서 내 컴퓨터를 식별하는 고유한 주소입니다.
보통 두 종류가 있습니다:
	•	공인 IP (Public IP): 인터넷 전체에서 고유한 주소. ISP에서 부여.
	•	사설 IP (Private IP): 공유기 내부에서만 쓰이는 주소 (ex. 192.168.x.x)

⸻

1. **macOS (OSX)**에서 IP 확인 방법

▸ 방법 1: 시스템 환경설정에서 확인 (GUI)
	1.	상단 메뉴바 > Apple 로고 클릭 → 시스템 설정
	2.	네트워크(Network) 클릭
	3.	사용 중인 네트워크(Wi-Fi 또는 유선)를 선택
	4.	오른쪽에 IP 주소가 표시됨 (예: 192.168.0.15)

⸻

▸ 방법 2: 터미널에서 확인 (CLI)
	1.	터미널 실행 (Spotlight에서 terminal 검색)
	2.	아래 명령어 입력:
        ipconfig getifaddr en0    # Wi-Fi 사용 시
        ipconfig getifaddr en1    # 유선 LAN 사용 시 (보통은 en1이거나 en2)
	3.	출력된 IP 주소가 현재 사설 IP 주소입니다.

※ 전체 정보 확인: ifconfig

⸻

2. Windows에서 IP 확인 방법

▸ 방법 1: 설정(GUI)에서 확인
	1.	시작 메뉴 > 설정 > 네트워크 및 인터넷
	2.	좌측 메뉴에서 Wi-Fi 또는 이더넷 선택
	3.	사용 중인 네트워크 클릭
	4.	아래로 스크롤 → 속성에서 IP 주소 확인 (예: 192.168.0.23)

⸻

▸ 방법 2: 명령 프롬프트(CLI)에서 확인
	1.	Windows + R → cmd 입력 후 실행
	2.	명령어 입력:

ipconfig

	3.	출력 내용 중에서:
	•	IPv4 주소: 192.168.x.x 형식 (내 컴퓨터의 사설 IP)
	•	기본 게이트웨이: 공유기 주소

⸻

3. 공인 IP 주소 확인 방법 (공통)

LAN 외부에서 보이는 공인 IP 주소를 확인하려면:

▸ 웹 브라우저에서 아래 사이트 접속:
	•	https://whatismyipaddress.com
	•	https://ip.pe.kr (한국어)

브라우저에서 접속하면 현재 사용하는 공인 IP가 바로 표시됩니다.

⸻



좋아요! 자바로 TCP 소켓을 사용한 채팅방을 만들 때, 기본적으로는 아래 구조로 나뉩니다:

⸻

🔗 기본 구조
	•	서버(Server)
→ 여러 클라이언트의 접속을 받고, 메시지를 중계함 (중앙 역할)
	•	클라이언트(Client)
→ 서버에 접속해서 메시지를 보내고 받음

⸻

📦 기본 예시 코드 (Java TCP 소켓)

⸻

1. 서버 코드 (ChatServer.java)

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    static List<Socket> clientList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("서버 시작됨...");

        while (true) {
            Socket client = server.accept();
            clientList.add(client);
            System.out.println("새 클라이언트 접속: " + client.getInetAddress());

            // 클라이언트마다 쓰레드로 처리
            new ClientHandler(client).start();
        }
    }

    // 클라이언트 담당 쓰레드
    static class ClientHandler extends Thread {
        Socket socket;
        BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("받은 메시지: " + msg);
                    broadcast(msg);
                }
            } catch (IOException e) {
                System.out.println("클라이언트 연결 끊김: " + socket.getInetAddress());
            } finally {
                try {
                    clientList.remove(socket);
                    socket.close();
                } catch (IOException e) {}
            }
        }

        // 모든 클라이언트에게 메시지 전송
        void broadcast(String msg) throws IOException {
            for (Socket s : clientList) {
                OutputStream os = s.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);
                pw.println(msg);
            }
        }
    }
}


⸻

2. 클라이언트 코드 (ChatClient.java)

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        System.out.println("서버에 연결됨");

        // 메시지 수신 쓰레드
        new Thread(() -> {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("받은 메시지: " + msg);
                }
            } catch (IOException e) {
                System.out.println("서버 연결 끊김");
            }
        }).start();

        // 메시지 전송
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String input;
        while ((input = keyboard.readLine()) != null) {
            out.println(input);
        }
    }
}


⸻

✅ 실행 방법 요약
	1.	ChatServer.java 실행 (서버 시작)
	2.	ChatClient.java 여러 개 실행 (클라이언트 접속)
	3.	클라이언트 간에 메시지 입력하면 서로 메시지가 공유됨

⸻

*/
}
