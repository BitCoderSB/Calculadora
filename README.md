<div align="center">

# Velora

### Pay with your face. Powered by Interledger.

**Biometric payment platform that combines facial recognition with the Interledger Protocol to enable seamless, cross-wallet money transfers — no cards, no QR codes, just your face.**

[![Built at Interledger Summit Hackathon](https://img.shields.io/badge/Built%20at-Interledger%20Summit%20Hackathon-4B32C3?style=for-the-badge)](https://interledger.org/es/summit/hackaton)
[![Node.js](https://img.shields.io/badge/Node.js-20+-339933?style=flat-square&logo=node.js&logoColor=white)]()
[![React](https://img.shields.io/badge/React-18-61DAFB?style=flat-square&logo=react&logoColor=black)]()
[![Open Payments](https://img.shields.io/badge/Open%20Payments-ILP-blueviolet?style=flat-square)]()
[![License: ISC](https://img.shields.io/badge/License-ISC-blue?style=flat-square)]()

</div>

---

## The Problem

Traditional payment methods are fragmented — cards, QR codes, NFC, and bank transfers all create friction. Merchants need expensive hardware, customers fumble with apps, and cross-border payments are slow and costly.

## Our Solution

**Velora** eliminates payment friction entirely. A customer walks up, a seller points their camera, and the payment flows instantly through the Interledger Protocol. Facial recognition replaces cards and PINs, while ILP ensures the money moves across any wallet, any currency, any network.

---

## How It Works

```
┌─────────────┐     ┌─────────────┐     ┌─────────────┐     ┌─────────────┐
│  1. Scan     │────▶│  2. Amount   │────▶│  3. Confirm  │────▶│  4. Done!    │
│  Customer's  │     │  & Details   │     │  via ILP     │     │  Receipt     │
│  Face        │     │              │     │  Grant       │     │  generated   │
└─────────────┘     └─────────────┘     └─────────────┘     └─────────────┘
   face-api.js         Seller enters       GNAP interactive      Outgoing payment
   identifies          amount + desc       authorization          created via STREAM
   the customer                            via Open Payments
```

1. **Facial Recognition** — The seller opens the "Charge" screen; face-api.js identifies the customer in real time by comparing 128-dimensional facial descriptors against registered users.
2. **Transfer Details** — The customer's wallet address is auto-filled. The seller enters the amount and a description.
3. **Interledger Payment** — The system creates an Incoming Payment, generates a Quote, and initiates a GNAP interactive grant. The customer authorizes the transaction.
4. **Instant Settlement** — Once authorized, the Outgoing Payment is created and funds flow through ILP/STREAM across wallets.

---

## Features

- **Biometric Onboarding** — Register your face during signup with real-time 128-D descriptor extraction
- **Face-Powered Payments** — Identify customers instantly; no cards or QR codes needed
- **Interledger / Open Payments** — Standards-based, interoperable cross-wallet transfers
- **3-Stage Payment Flow** — Incoming Payment → Grant Authorization → Outgoing Payment
- **Interactive Grants (GNAP)** — Secure authorization via redirect-based grant negotiation
- **Dual Face-Detection Engines** — face-api.js (simple) or ONNX/ArcFace/MediaPipe (advanced)
- **Hexagonal Architecture** — Clean `domain/app/infra` separation per module
- **Auto-Migration** — Database tables created automatically on server startup

---

## Tech Stack

| Layer | Technologies |
|-------|-------------|
| **Frontend** | React 18, Vite 5, Tailwind CSS 3, Zustand, Framer Motion, Lottie |
| **Face Detection (client)** | face-api.js, ONNX Runtime Web, MediaPipe Tasks Vision |
| **Backend** | Node.js 20+, Express 5, Helmet, Morgan, CORS |
| **Payments** | `@interledger/open-payments` (ILP / Open Payments SDK) |
| **Face Detection (server)** | `@vladmandic/face-api`, `@tensorflow/tfjs-node` |
| **Auth & Crypto** | `jose` (JWT/JWK), `argon2`, `bcrypt` |
| **Database** | PostgreSQL (primary), Sequelize ORM |
| **Validation** | Zod |

---

## Architecture

```
velora/
├── apps/api/src/                     # Express API server
│   ├── index.js                      # Bootstrap: middlewares, routes, DB migration
│   ├── modules/
│   │   ├── payments/                 # ILP/Open Payments domain
│   │   │   ├── domain/              #   Business logic (secondFlow service)
│   │   │   ├── app/                 #   Application services / use cases
│   │   │   └── infra/               #   HTTP routes, Open Payments adapters
│   │   ├── interledger/              # Shared ILP adapters (grants, quotes, client)
│   │   ├── face-recognition/         # Biometric registration & verification
│   │   └── wallet/                   # Wallet & user management
│   ├── shared/                       # Cross-cutting: crypto, kernel, messaging
│   └── use-cases/                    # CLI scripts (first-flow demo)
│
├── frontend/                         # Vite + React SPA
│   ├── src/components/pages/         # 13 page components (landing → receipt)
│   ├── src/components/               # FaceCaptureSimple, FaceCaptureONNX, UI
│   ├── src/services/database.js      # Client-side local storage wrapper
│   └── public/models/                # Pre-trained face-api.js model weights
│
├── scripts/                          # Dev/deploy utilities
└── docs/                             # Additional documentation
```

Each backend module follows **hexagonal architecture**: `domain/` (pure business rules), `app/` (use cases), `infra/` (HTTP routes, DB adapters, external API clients).

---

## API Endpoints

Base URL: `http://localhost:3000`

### Payments (`/api/payments`)

| Method | Route | Description |
|--------|-------|-------------|
| `POST` | `/identify` | Validate sender/receiver pair can operate |
| `POST` | `/charge` | Execute the full "first-flow" (interactive) payment |
| `POST` | `/second-flow/incoming` | Create an Incoming Payment → returns `confirmation` |
| `POST` | `/second-flow/authorize` | Generate Quote + Grant → returns `authorizationUrl` |
| `POST` | `/second-flow/finalize` | Continue grant, create Outgoing Payment via ILP |

### Face Recognition (`/api/face`)

Biometric registration and verification endpoints for server-side facial recognition.

### Health Check

| Method | Route | Description |
|--------|-------|-------------|
| `GET` | `/health` | Server health status |

---

## Getting Started

### Prerequisites

- **Node.js 20+** and **npm 10+**
- **PostgreSQL** instance
- **Open Payments credentials** (wallet address, key ID, PEM private key)

### 1. Clone the Repository

```bash
git clone https://github.com/BitCoderSB/Velora.git
cd Velora
```

### 2. Install Dependencies

```bash
# Backend
npm install

# Frontend
cd frontend
npm install
cd ..
```

### 3. Configure Environment Variables

Create a `.env` file in the root directory:

```env
KEY_ID=<your-key-uuid>
CLIENT_WALLET=https://ilp.interledger-test.dev/<your-wallet>
RECEIVER_WALLET=https://ilp.interledger-test.dev/<receiver>
SENDER_WALLET=https://ilp.interledger-test.dev/<sender>
PRIVATE_KEY_PATH=private.key
DATABASE_URL=postgresql://user:pass@localhost:5432/velora
PORT=3000
```

### 4. Add Your Private Key

Place your PEM private key file as `private.key` in the project root (or update `PRIVATE_KEY_PATH`).

### 5. Run the Application

```bash
# Start the backend
node apps/api/src/index.js

# In another terminal, start the frontend
cd frontend
npm run dev
```

The backend runs on `http://localhost:3000` and the frontend on `http://localhost:5173`.

> **Note:** Face recognition database tables are auto-created on server startup.

---

## Payment Flow Example (Second Flow)

**Step 1** — Create an Incoming Payment:

```bash
curl -X POST http://localhost:3000/api/payments/second-flow/incoming \
  -H "Content-Type: application/json" \
  -d '{
    "sendingWalletAddressUrl": "https://ilp.interledger-test.dev/sender",
    "receivingWalletAddressUrl": "https://ilp.interledger-test.dev/receiver",
    "amount": "1000",
    "clientWalletAddressUrl": "https://ilp.interledger-test.dev/client",
    "keyId": "your-key-id",
    "privateKeyPath": "private.key"
  }'
```

**Step 2** — Authorize (use the `confirmation` from Step 1):

```bash
curl -X POST http://localhost:3000/api/payments/second-flow/authorize \
  -H "Content-Type: application/json" \
  -d '{ "confirmation": "<confirmation-from-step-1>" }'
```

Visit the returned `authorizationUrl` to approve the grant.

**Step 3** — Finalize (use the `pendingAuthorization` from Step 2):

```bash
curl -X POST http://localhost:3000/api/payments/second-flow/finalize \
  -H "Content-Type: application/json" \
  -d '{ "pendingAuthorization": "<pending-from-step-2>" }'
```

---

## Roadmap

- [ ] Docker containerization (API + DB + Frontend)
- [ ] CLI tool for key generation and environment setup
- [ ] Automated test suite (unit + integration)
- [ ] Observability with OpenTelemetry / Prometheus
- [ ] End-to-end tests for interactive GNAP grants
- [ ] Multi-language support

---

## Built With

This project was built at the [**Interledger Summit Hackathon**](https://interledger.org/es/summit/hackaton) — an event focused on building innovative solutions using the Interledger Protocol and Open Payments standard to create a more interconnected and accessible financial ecosystem.

---

## License

ISC — see [package.json](package.json) for details.

---

<div align="center">

**[Interledger Summit Hackathon](https://interledger.org/es/summit/hackaton)** | **[Open Payments Docs](https://openpayments.dev/)** | **[Interledger.org](https://interledger.org/)**

</div>
